package ratosportuguesesaviadores;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Professor
 */
public class Banco {

    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                //Class.forName("com.mysql.jdbc.Driver"); //para mysql
                Class.forName("org.postgresql.Driver");//para postgresql
                String host = "localhost";
                String port = "5432";
                String database = "RPA";
                String user = "postgres";
                String pass = "152535";//digitar a senha do seu banco
                //String url = "jdbc:mysql://"+host+":"+port+"/"+database; //para mysql
                String url = "jdbc:postgresql://" + host + ":" + port + "/" + database;//para postgresql
                connection = DriverManager.getConnection(url, user, pass);

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void close() {
        if (connection == null) {
            throw new RuntimeException("Nenhuma conexão aberta!");
        } else {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void salvar(Usuario usuario) {
        try {
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO usuario (nome, senha) values(?, ?)");
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());

            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void salvarPersonagem(Personagens perso) {
        try {
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO personagem (id,nome,classe,raca,nome_do_usuario,nivel,vida,vidamaxima) values( ?,?,?,?,?,?,?,?)");
            ps.setInt(1, perso.getId());
            ps.setString(2, perso.getNome());
            ps.setString(3, perso.getClasse());
            ps.setString(4, perso.getRaca());
            ps.setString(5, perso.getNome_do_usuario());
            ps.setInt(6, perso.getNivel());
            ps.setInt(7, perso.getVida());
            ps.setInt(8, perso.getVidaMaxima());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void salvatStatus(Status stats) {
        try {
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO status (id_do_personagem,str,dex,cont,cha,sab,inte) values(?,?,?,?,?,?,?)");
            ps.setInt(1, stats.getId());
            ps.setInt(2, stats.getStr());
            ps.setInt(3, stats.getDex());
            ps.setInt(4, stats.getCons());
            ps.setInt(5, stats.getCha());
            ps.setInt(6, stats.getSab());
            ps.setInt(7, stats.getInte());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void salvarPoderes(Poderes p) {
        try {
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO poderes (id_do_personagem,nome,nivel,dado,tdc,vmc,descricao,id) values (?,?,?,?,?,?,?,?)");
            ps.setInt(1, p.getId_do_personagem());
            ps.setString(2, p.getNome());
            ps.setInt(3, p.getNivel());
            ps.setString(4, p.getDado());
            ps.setString(5, p.getTdc());
            ps.setString(6, p.getVms());
            ps.setString(7, p.getDescricao());
            ps.setInt(8, p.getId());
            ps.execute();
            ps = con.prepareStatement("INSERT INTO conhecem (id_do_personagem,id_da_magia) values (?,?)");
            ps.setInt(1, p.getId_do_personagem());
            ps.setInt(2, p.getId());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void mudarVidaDoPersonagem(int m, String nome) {
        try {
            Connection con = Banco.getConnection();
            if (nome.equals("personagem")) {

            } else {
                PreparedStatement ps = con.prepareStatement("update personagem set vida = ? where nome like '" + nome + "'");
                ps.setInt(1, m);

                ps.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static boolean verificadorDeIdDosPersonagens(int idfoda) {
        try {

            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("Select id from  personagem");
            ResultSet rs = ps.executeQuery();
            System.out.println(rs.next() + " " + idfoda);
            if (rs.next() == false) {
                return false;
            } else {
                while (rs.next()) {
                    if (idfoda == rs.getInt("id")) {
                        return true;
                    }
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean verificadorDeIdDaMagia(int id) {
        try {
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM poderes");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                if (id == rs.getInt("id")) {
                    return true;
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean verificadorDeNomePika(String nome) {
        try {
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("Select*from usuario");
            ResultSet rs = ps.executeQuery();
            if (rs.next() == false) {
                return false;
            } else {
                while (rs.next()) {
                    if (nome.equals(rs.getString("nome"))) {
                        return true;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void atualizaLogin(String Login_antigo, String Login_novo) {
        try {
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("update usuario set nome = ? where nome = ?");
            ps.setString(1, Login_novo);
            ps.setString(2, Login_antigo);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void visualizaTabela(String tabela, String... atributos) {
        try {
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM " + tabela);
            ResultSet rs = ps.executeQuery();

            String selectfrom = "";
            while (rs.next()) {   // Passar pelas linhas uma a uma
                for (String i : atributos) {  // Passar pelas colunas uma a um 
                    selectfrom += "| ";
                    selectfrom += rs.getString(i);
                    selectfrom += " |";
                }
                selectfrom = selectfrom + "\n";
            }
            JOptionPane.showMessageDialog(null, selectfrom);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void visualizarPersonagens(String user) {
        try {
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("Select id,nome from personagem where nome_do_usuario like " + "'" + user + "'");
            ResultSet rs = ps.executeQuery();
            String resultado = "";
            while (rs.next()) {
                resultado += "---------------------------------\n";
                resultado += rs.getInt("id") + " " + rs.getString("nome") + "\n";

            }
            resultado += "---------------------------------\n";
            JOptionPane.showMessageDialog(null, resultado);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static String visualizarListaDeMagias(String nome) {
        try {
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("select*from conhecem inner join poderes poderes2 ON poderes2.id = conhecem.id_da_magia inner join personagem ON personagem.id = conhecem.id_do_personagem where personagem.nome like '" + nome + "'");
            ResultSet rs = ps.executeQuery();
            String resultado = "<html>id  nome  dadoDeDano<br>";
            while (rs.next()) {
                resultado += "---------------------------------<br>";
                resultado += rs.getInt("id")+"    "+rs.getString("nome") + "     " + rs.getString("dado") + "<br>";
            }
            resultado += "---------------------------------<html/>";
            return resultado;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Tu não tem é nada bino";
    }

    public static void visualisarMagia(int id) {
        try {
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("Select nome,nivel,dado,tdc,vmc,descricao from poderes where id =" + id);

            ResultSet rs = ps.executeQuery();
            String resultado = "";
            while (rs.next()) {
                resultado += rs.getString("nome") + "    " + rs.getInt("nivel") + "\n";
                resultado += "_______________________________\n";
                resultado += "VMS: " + rs.getString("vmc") + " " + rs.getString("dado") + "\n";
                resultado += "tempo de conjuração: " + rs.getString("tdc") + "\n\n";
                resultado += rs.getString("descricao");
            }
            JOptionPane.showMessageDialog(null, resultado);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Personagens pegarOsBagueteDoPersonagem(int id) {
//        this.id = id;
//        this.nivel = nivel;
//        this.vida = vida;
//        this.vidaMaxima = vidaMaxima;
//        this.classe = classe;
//        this.raca = raca;
//        this.nome = nome;
//        this.nome_do_usuario = nome_do_usuario;
//        this.status = status;
        Status is = new Status(9999, 0, 0, 0, 0, 0, 0);
        Personagens i = new Personagens(9999, 9999, 9999, 9999, "invalido", "invalido", "invalido", "invalido", is);
        try {

            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("select personagem.id,personagem.nome,personagem.classe,personagem.raca,personagem.nivel,personagem.vida,personagem.vidamaxima,personagem.nome_do_usuario,status.str,status.dex,status.cont,status.sab,status.inte,status.cha from personagem  inner join status ON status.id_do_personagem = personagem.id where id =?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "tem algo errado boy");
            } else {

                System.out.println("entrou no wile");
                Status s = new Status(id, rs.getInt("cha"), rs.getInt("sab"), rs.getInt("inte"), rs.getInt("dex"), rs.getInt("str"), rs.getInt("cont"));
                Personagens p = new Personagens(id, rs.getInt("nivel"), rs.getInt("vida"), rs.getInt("vidamaxima"), rs.getString("classe"), rs.getString("raca"), rs.getString("nome"), rs.getString("nome_do_usuario"), s);
                return p;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }
    public static void editarPersonagem(Personagens p){
        try {
          Connection con = Banco.getConnection();
        PreparedStatement ps = con.prepareStatement("update personagem set nome = ?,classe = ?,nivel = ?,vidamaxima = ?   where id =?;");  
        ps.setString(1, p.getNome());
        ps.setString(2, p.getClasse());
        ps.setInt(3, p.getNivel());
        ps.setInt(4, p.getVidaMaxima());
        ps.setInt(5, p.getId());
        ps.execute();
        ps = con.prepareStatement("update status set str = ?,dex = ?,cont=?,cha =?,sab=?,inte=? where id_do_personagem = ?");
        ps.setInt(1, p.status.str);
        ps.setInt(2, p.status.dex);
        ps.setInt(3, p.status.cons);
        ps.setInt(4, p.status.cha);
        ps.setInt(5, p.status.sab);
        ps.setInt(6, p.status.inte);
        ps.setInt(7, p.id);
        ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    public static boolean login(String nome, String senha) {
        try {
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM usuario");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                if (nome.equals(rs.getString("nome")) && senha.equals(rs.getString("senha"))) {
                    return true;
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void deletaUser(String login) {
        try {
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("Delete FROM usuario WHERE usuario = ?");
            ps.setString(1, login);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void atualizaSenhaIdade(Usuario usuario) {
        deletaUser(usuario.getNome());
        salvar(usuario);
    }
}
