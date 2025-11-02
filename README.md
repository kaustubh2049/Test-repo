**Jenkins maven 4:**
select git --> paste the repo link https://github.com/rubenlagus/TelegramBots.git
build step --> invoke top level maven --> select the name and goal as compile

**Jenkins node creation 5:**
note: security--> agent(Random)
go in setting --> node --> new node 
make node in c drive , copy that path and paste it in the root directory
go in that slave and then run the windows command

**Jenkins slave node 6:**
select restricted where the project can run 
in labels write the node name 
go down
windows batch : echo Hello World

**Jenkins slave node 7:**
https://github.com/bonigarcia/selenium-jupiter.git
