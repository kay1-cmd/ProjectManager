
let displayClientElement = document.getElementById("display-client");
let clientList = document.getElementById("client-list");
let newClientButton = document,getElementById("new-client-button");


//Create a new client
function createClient(){
    fetch('http://localhost:8080/freelance/createClient',{
        method:'POST'
    })
    .then(response => response.json())
}

//Display a single client
function fetchClient(){
    fetch('http://localhost:8080/freelance/getClient/{clientID}',{
        method:'GET'
    })
    .then(response => response.json())
    .then(client =>{

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
}



//Event listener for creating a new client
newFactButton.addEventListener('click',createClient);

//Event listener for displaying a client
newFactButton.addEventListener('click',fetchClient);

//Event listener for client list button
newFactButton.addEventListener('click', fetchClientList);