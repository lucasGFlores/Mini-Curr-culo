const http = require("http");
const port = 8080;
const server = http.createServer((req, res) => {
  if (req.url == "/home") {
    res.writeHead(200, { "Content-Type": "text/html" }); //para entender o que está recebendo
    res.end("<h1>home dos page</h1>"); //oque ele vai mandar
  }
  if (req.url == "/users") {
    const users = [
      {
        name: "rogerio",
        email: "rogerio@gmail.com",
      },
      {
        name: "glauber",
        email: "glauber@gmail.com",
      },
      {
        name: "004",
        email: "004@gmail.com",
      },
      {
        name: "boga",
        email: "boga@gmail.com",
      },
    ];
    res.writeHead(200, { "Content-Type": "application/json" });
    res.end(JSON.stringify(users));
  }
});

server.listen(port, () => console.log(`rodando na porta ${port}`));
