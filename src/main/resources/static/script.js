
let displayClientElement = document.getElementById("display-client");
let clientList = document.getElementById("client-list");
let newClientButton = document.getElementById("new-client-button");


//Create a new client
function createClient(){
    var name = document.getElementById("client-name").value;
    var email = document.getElementById("client-email").value;
    var password = document.getElementById("client-password").value;
    var number = document.getElementById("client-number").value;

    fetch('http://localhost:8080/freelance/createClient',{
        method:'POST',
        headers:{
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ name: name, email: email, password: password, number: number})
        })
    .then(response => response.json())
    .then(data => {
        console.log("Success", data);
    })
    .catch(error => {
        console.error("Error:", error);
    })
}

//Display a single client
function fetchClient(clientID){
    fetch('http://localhost:8080/freelance/getClient/{clientID}',{
        method:'GET',
        headers:{
            'Content-Type': 'application/json'}
    })
    .then(response => response.json())
    .then(data =>{
        console.log("Success", data);
        //Update client paragraph/body
        displayClientElement.textContent = data.addEventListener
    })
    .catch(error => {
        console.error('Error fetching client:', error);
    });
}


//Fetch and display client list
function fetchClientList(){
    fetch('http://localhost:8080/freelance/listClients',{
        method:'GET'
    })
    .then(response => response.json())
    .then(clients =>{

        //Clear any existing items
        clientList.innerHTML ='';

        clients.forEach(client =>{
            const li = document.createElement('li');
            li.textContent = client.name;
            clientList.appendChild(li);
        });

    })
    .catch(error => {
        console.error('Error fetching clients:', error);
    });
}






//Event listener for client list button
newFactButton.addEventListener('submit', fetchClientList);



//Event listener for displaying a client
//newFactButton.addEventListener('click',fetchClient);