const Person = require("./Person");
const dotenv = require("dotenv");

const connectToDAtabase = require("./src/database/connect");
dotenv.config();
connectToDAtabase();
/* const person = new Person("rogerio"); */
/* require('./modules/path'); */
/* require('./modules/fs')*/
require("./modules/express");

