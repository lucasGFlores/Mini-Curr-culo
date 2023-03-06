const { error } = require("console");
const fs = require("fs"); //manipular arquivos e diretorios
const path = require("path");
//criar diretorio
fs.mkdir(path.join(__dirname, "/teste"), (error) => {
  if (error) {
    return console.log(error);
  }
  console.log("pasta foi criada");
});
/* //criar um arquivo
fs.writeFile(
  path.join(__dirname, "/teste", "teste.txt"),
  "HELROOOO",
  (error) => {
    if (error) {
      return console.log(error);
    }
    console.log("foi criado o arquivo e escrito");
  }
);

//adicionar conteúdo
fs.appendFile(
  path.join(__dirname, "/teste", "teste.txt"),
  `\nI NEED A HEROO\nOOOOOOOOOOO`,
  (error) => {
    if (error) {
      return console.log(error);
    }
    console.log("criado com sucesso");
  }
);
//ler arquivo
fs.readFile(
  path.join(__dirname, "/teste", "teste.txt"),
  "utf8",
  (error, data) => {
    if (error) {
      return console.log(error);
    }
    console.log(data);
  }
); */

//necessário isso para que tudo fique na ordem correta
fs.writeFile(
    path.join(__dirname, "/teste", "teste.txt"),
    "HELROOOO",
    (error) => {
      if (error) {
        return console.log(error);
      }
      console.log("foi criado o arquivo e escrito");
      fs.appendFile(
          path.join(__dirname, "/teste", "teste.txt"),
          `\nI NEED A HEROO\nOOOOOOOOOOO`,
          (error) => {
            if (error) {
              return console.log(error);
            }
            console.log("criado com sucesso");
            fs.readFile(
              path.join(__dirname, "/teste", "teste.txt"),
              "utf8",
              (error, data) => {
                if (error) {
                  return console.log(error);
                }
                console.log(data);
              }
            );
          }
        );
    }
  );
