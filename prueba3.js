var fs = require('fs')  ;
buf=fs.readFileSync('./test.txt')
var str = buf.toString();
var arreglo=str.split('\n');

var conteo=0;
for (var i = 0; i < arreglo.length; i++) {
  conteo++;
}
console.log(conteo);
