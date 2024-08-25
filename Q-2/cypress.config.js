const { defineConfig } = require("cypress");

module.exports = defineConfig({
  e2e: {
    setupNodeEvents(on, config) {
    
    },
    testIsolation: false,
    baseUrl :'https://www.akakce.com/',
    username : 'aliikazankaya@gmail.com',
    password : '6961020Ak_'
  },
});
