// import discord.js
const Discord = require('discord.js');

// create a new Discord client
const client = new Discord.Client();

// run this code when the client is ready
client.on('ready', () => {
  console.log('I am ready!');
});

// respond to a message
client.on('message', message => {
  if (message.content === 'ping') {
    message.reply('pong');
  }
});

// sleep for a number of milliseconds
function sleep(ms) {
  return new Promise(resolve => setTimeout(resolve, ms));
}

// function to make a web request to a website and return the response
async function getWebsite(url) {
  const response = await fetch(url);
  const body = await response.text();
  return body;
}

// when a message is deleted, log it
client.on('messageDelete', message => {
  console.log(`Message by ${message.author.tag} was deleted.`);
});

// login
client.login("your token here")
