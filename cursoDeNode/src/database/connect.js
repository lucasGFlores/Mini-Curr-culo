const mongoose = require("mongoose");
const connectToDAtabase = async () => {
  await mongoose.connect(
    `mongodb+srv://${process.env.MONGODB_USERNAME}:${process.env.MONGODB_PASSWORD}@rogerio.txphhyr.mongodb.net/?retryWrites=true&w=majority`).then(()=>
    {
        console.log("conecxão um sucesso na db");
    }).catch((error)=>{
        return console.log("aconteceu um erro no data base");
    })  
    }
module.exports = connectToDAtabase;
