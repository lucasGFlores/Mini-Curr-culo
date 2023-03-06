
const path = require('path');
//apenas o nome do arquivo atual
console.log(path.basename(__filename)); //file name é o arquivo atual
//nome do diretorio
console.log(path.basename(__dirname));
//extensão do arquivo
console.log(path.extname(__filename));
//Cria o "objeto"
console.log(path.parse(__filename));
//juntar camihnos, eles podem não existir mais ele manda mesmo assim
console.log(`caminho normal:${__dirname}\ncaminho adicionado:${path.join(__dirname,'rogerio','ceni','transformersUltimate','index.htm')}`)
