var websocket = new WebSocket("ws://"+ document.location.host + document.location.pathname + "chat");

websocket.onopen= function onOpen(){
var p = document.createElement("p");
p.innerHTML = "Verbunden";
document.getElementById("outputtext").appendChild(p);
};
websocket.onmessage = function onMessage(evt) {
var p= document.createElement("p");
p.innerHTML = evt.data;
document.getElementById("outputtext").appendChild(p);
};

function send(){
var name = document.getElementById("name")
var inputtext = document.getElementById("inputtext")
websocket.send(name.value + ":" + inputtext.value);
};