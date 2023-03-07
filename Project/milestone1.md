<table><tr><td> <em>Assignment: </em> It114 Milestone1</td></tr>
<tr><td> <em>Student: </em> Gabriel Jastrzebski (gbj3)</td></tr>
<tr><td> <em>Generated: </em> 3/6/2023 10:07:20 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-milestone1/grade/gbj3" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create a new branch called Milestone1</li><li>At the root of your repository create a folder called Project</li><ol><li>You will be updating this folder with new code as you do milestones</li><li>You won't be creating separate folders for milestones; milestones are just branches</li></ol><li>Create a milestone1.md file inside the Project folder</li><li>Git add/commit/push it to Github</li><li>Create a pull request from Milestone1 to main (don't complete/merge it yet)</li><li>Copy in the latest Socket sample code from the most recent Socket Part example of the lessons</li><ol><li>Recommended Part 5 (clients should be having names at this point and not ids)</li><li><a href="https://github.com/MattToegel/IT114/tree/Module5/Module5">https://github.com/MattToegel/IT114/tree/Module5/Module5</a>&nbsp;<br></li></ol><li>Git add/commit the baseline</li><li>Ensure the sample is working and fill in the below deliverables</li><li>Get the markdown content or the file and paste it into the milestone1.md file or replace the file with the downloaded version</li><li>Git add/commit/push all changes</li><li>Complete the pull request merge from step 5</li><li>Locally checkout main</li><li>git pull origin main</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Startup </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot showing your server being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/223304786-2762c1ca-d6db-4d66-b08f-7c7206fbe362.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Server listening to port<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot showing your client being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/223304969-b5acaefc-aa1f-4519-97ec-535a9ba52338.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Server saying the Client connected to its port<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/223305151-2bbc5dae-dfe3-4bb6-a35c-52d7bfabefce.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Client connecting to Server<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the connection process</td></tr>
<tr><td> <em>Response:</em> <p>The server code creates a socket object that listens for incoming connections on<br>the port 3000. The client creates a name using the /name command as<br>to have identification. The client then creates a socket object connecting to that<br>port using /connect localhost:3000. The server accepts the client and creates a new<br>thread to handle new messages .&nbsp; Then the client can send a message<br>using an object associated with the socket that will be read by the<br>server who then broadcasts the messages.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Sending/Receiving </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/223305268-e73cb504-6f5b-468d-b64e-6f1ba49bf12f.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Two clients connected to the Server with messages being sent that is shown<br>the the other client and broadcasted by the server. Shows both clients being<br>identified when sending their message.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/223309961-b4af2a7d-6193-4e14-b1ab-4de0870c73bb.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Two clients in different rooms trying to send messages<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the messages are sent, broadcasted, and received</td></tr>
<tr><td> <em>Response:</em> <p>The client creates a message object that it sends to the server which<br>is associated with the socket. The chat room has a list of the<br>connected clients and when a new message is recieved, the room iterates through<br>and sends the message to only those in the room. The server thread<br>recieves the message from the client and processes it. It is then broadcasted<br>to those associated with the socket. Finally the sending client creates a message<br>object that it sends to the server for the server to read.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Disconnecting / Terminating </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/223305663-7303c144-8ff3-4a75-8213-fc061356e5af.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Client disconnecting from the server<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/223305752-5fb8e176-abf0-446d-bf3c-d39fdee977d1.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Server terminating with the client disconnecting<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the various disconnects/terminations are handled</td></tr>
<tr><td> <em>Response:</em> <p>When a client disconnects the socket object associated with it gets closed. Server<br>Thread detects its closure and removes the client from its list. The client<br>doesn&#39;t crash when a server disconnects because the server does not respond the<br>Server Thread closes the room and has all clients connected disconnect. When a<br>client disconnects, server thread has the client removed from its list and the<br>server continues to listen to its port.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add the pull request for this branch</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/gbj3/IT114-008/pull/7">https://github.com/gbj3/IT114-008/pull/7</a> </td></tr>
<tr><td> <em>Sub-Task 2: </em> Talk about any issues or learnings during this assignment</td></tr>
<tr><td> <em>Response:</em> <p>I learned how to properly connect a server with multiple clients at one<br>time. I had never done this before and it has been a new<br>realm for me entirely. Further, I had issues when it came to compiling<br>my program. I had been trying to compile in the Project folder which<br>is not allowed since I had Project as a package.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-milestone1/grade/gbj3" target="_blank">Grading</a></td></tr></table>