const http = require('http');



http.createServer((req, res) => {


    res.write('welcome');
    res.end();
}).listen(5000, () => console.log('server running'));