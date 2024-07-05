document.addEventListener('DOMContentLoaded', () => {
    document.getElementById("client-list-button").addEventListener('click', fetchClientList);
    document.getElementById("client-form").addEventListener("submit", createClient);
});

let clientList = document.getElementById("client-list");
let newClientButton = document.getElementById("new-client-button");
let clientEmailDetail = document.getElementById("client-email-detail");
let clientNameDetail = document.getElementById("client-name-detail");
let clientNumberDetail = document.getElementById("client-number-detail");

//Create a new client
function createClient(){
    event.preventDefault();

    var name = document.getElementById("client-name").value;
    var email = document.getElementById("client-email").value;
    var password = document.getElementById("client-password").value;
    var number = document.getElementById("client-number").value;

    console.log("Name:", name);
    console.log("Email:", email);
    console.log("Password:", password);
    console.log("Number:", number);

    fetch('http://localhost:8080/freelance/createClient',{
        method:'POST',
        headers:{
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            clientName: name,
            clientEmail: email,
            clientPass: password,
            clientNumber: number
        })
    })
    .then(response => response.json())
    .then(data => {
        console.log("Success", data);
        var modal = document.getElementById("client-id-modal");
        var clientIdText = document.getElementById("client-id-text");
        clientIdText.textContent = `Client Created. Client ID: ${data.clientID}`;
        modal.style.display = "block";

        document.getElementById("client-form").reset();
    })
    .catch(error => {
        console.error("Error:", error);
    })

    var closeBtn = document.querySelector(".close");
    if (closeBtn) {
        closeBtn.addEventListener("click", function() {
            var modal = document.getElementById("client-id-modal");
            modal.style.display = "none";
        });
}
}

//Display a single client
function fetchClient(clientID){
    fetch(`http://localhost:8080/freelance/getClient/${clientID}`,{
        method:'GET',
        headers:{
            'Content-Type': 'application/json'}
    })
    .then(response => response.json())
    .then(data =>{
        console.log("Success", data);
        clientEmailDetail.textContent = data.clientEmail;
        clientNameDetail.textContent = data.clientName;
        clientNumberDetail.textContent = data.clientNumber;
        document.getElementById("client-details").style.display = "block";
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
        const clientList = document.getElementById('client-list');
        clientList.innerHTML ='';

         clients.forEach(client => {
            const tr = document.createElement('tr');

            const idTd = document.createElement('td');
            idTd.textContent = client.clientID;
            tr.appendChild(idTd);

            const emailTd = document.createElement('td');
            emailTd.textContent = client.clientEmail;
            tr.appendChild(emailTd);

            const nameTd = document.createElement('td');
            nameTd.textContent = client.clientName;
            tr.appendChild(nameTd);

            const numberTd = document.createElement('td');
            numberTd.textContent = client.clientNumber;
            tr.appendChild(numberTd);

            clientList.appendChild(tr);
         });

    })
    .catch(error => {
        console.error('Error fetching clients:', error);
    });
    document.addEventListener('DOMContentLoaded', () => {
        fetchClientList();
    });
}