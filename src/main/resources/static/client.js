document.addEventListener('DOMContentLoaded', function() {
    // FETCH CLIENT'S DETAILS
    fetch('/api/client')
        .then(response => response.json())
        .then(clients => {
            const tableBody = document.getElementById('clientTable').getElementsByTagName('tbody')[0];
            clients.forEach(client => {
                // Create row and display  client data
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${client.id || ''}</td>
                    <td>${client.fname || ''}</td>
                    <td>${client.onames || ''}</td>
                    <td>${client.client_idno || ''}</td>
                    <td>${client.email || ''}</td>
                    <td>${client.dob || ''}</td>
                `;
                tableBody.appendChild(row);
            });
        })
        .catch(error => {
            console.error('Error fetching clients:', error);
        });
});
