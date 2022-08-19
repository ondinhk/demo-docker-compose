# How to run it
Build code:
<pre> chmod 755 buildJar.sh
./buildJar.sh
</pre>

Start docker-compose:
<pre>docker-compose up -d --build</pre>

Test the Application
<pre> # Add user
curl localhost:8080/demo/add -d name=FirstName -d email=someemail@someemailprovider.com

# Get all user
curl localhost:8080/demo/all
</pre>
Open GUI MYSQL: http://localhost:8090

Stop the Application
<pre>docker compose down</pre>

<h1>Good luck!</h1>