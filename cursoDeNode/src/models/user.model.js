const mongoose = require('mongoose')
const userSchema = new mongoose.Schema({
    firstName: {
        type: String,
        required: true, //isso diz que é obrigatório receber esse valor
    },
    lastName:{
        type: String,
        required: true, 
    },
    email:{
        type: String,
        required: true, 
    },
    password:{
        type: String,
        required: true, 
        minlength: 7,
    },
});
const UserModel =  mongoose.model("Users",userSchema);
module.exports = UserModel;