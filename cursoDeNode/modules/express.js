const express = require("express");
const UserModel = require("../src/models/user.model");
//criando um servidor com express
const app = express();
app.use(express.json());
const port = 8080;

app.get("/home", (req, res) => {
  res.status(200).send("<h1>BOGER</h1>");
});
app.get("/users", async (req, res) => {
  try {
    const users = await UserModel.find({});
    res.status(200).json(users);
  } catch (error) {
    return res.status(500).send(error.message);
  }
});

app.get("/users/:id", async (req, res) => {
  //o :id é tipo encarado como um parâmetro ou variável
  try {
    const id = req.params.id; //pega o parametro
    const user = await UserModel.findById(id);
    return res.status(200).json(user);
  } catch (error) {
    return res.status(500).send(error.message);
  }
});
app.post("/users", async (req, res) => {
  try {
    const user = await UserModel.create(req.body);
    res.status(201).json(user);
  } catch (error) {
    res.status(500).send(error.message);
  }
});
app.patch("/users/:id", async (req, res) => {
  try {

    const id = req.params.id
    const user = await UserModel.findByIdAndUpdate(id, req.body, { new: true });

    res.status(200).json(user);
  } catch (error) {
    res.status(500).send(error.message);
  }
});
app.delete("/users/:id", async (req, res) => {
  try {
    const id = await req.params.id;
    const user = await UserModel.findByIdAndDelete(id);
    res.status(200).json(user);
  } catch (error) {
    res.status(500).send(error.message);
  }
});
app.listen(port, () => console.log(`rodando o express na ${port}`));
