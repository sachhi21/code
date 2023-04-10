
const { log } = require('console');
const fs = require('fs');
const path = require('path')

/*
// create folder
fs.mkdir(path.join(__dirname, '/nkdebug'), {}, (err) =>  {

    if(err) throw err;
    console.log('folder created');
});


// create and write to file
fs.writeFile(path.join(__dirname, '/nkdebug', 'demo.text'), 'welcome to Node js', (err) =>  {

    if(err) throw err;
    console.log('File written');
});



// read file
fs.readFile(path.join(__dirname, '/nkdebug', 'demo.text'),'utf8', (err, data) =>  {

    if(err) throw err;
    console.log(data);
});

*/

// rename file
fs.rename(path.join(__dirname, '/nkdebug', 'demo2222.text'),path.join(__dirname, '/nkdebug', 'data-nkdeb.text'), (err) =>  {

    if(err) throw err;
    console.log('file renamed');
});