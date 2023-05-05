<h2>Gabriel Jastrzebski <br> IT114-008 <br> Chatroom </h2>
<h3>https://youtu.be/rLIzjZjJfLM</h3>

<h1>Milestone 1</h1>
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

<h1>Milestone 2</h1>
<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone 2</td></tr>
<tr><td> <em>Student: </em> Gabriel Jastrzebski (gbj3)</td></tr>
<tr><td> <em>Generated: </em> 4/5/2023 11:28:06 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-chatroom-milestone-2/grade/gbj3" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone2 from the proposal document:&nbsp; <a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Payload </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Payload Screenshots</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/230239275-28eafd92-9e2f-4f23-9d48-f63499702022.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Payload code<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/230239586-5ae93ab0-238e-40e9-ae0f-e4d8719b51fb.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Payload in client (connect. message, roll)<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Server-side commands </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the mentioned commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/230239967-f204f10e-75e1-44a9-967d-a488ac5c8925.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Code for commands<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/230240090-cdedae1d-674d-4f7b-b0f8-9ffd25c8b480.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Output of commands<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Explain the logic/implementation of each commands</td></tr>
<tr><td> <em>Response:</em> <p>Roll works by splitting the message into an array split by a space.<br>It then looks at the second index (where the format would be decided)<br>and tries to parse it. If it can, that means it&#39;s an integer<br>and therefore it is in the /roll # format. Then just do the<br>math and output. If it can&#39;t, it is in the other format. It<br>then splits into two parts by looking for the d character. Those values<br>are stored in an array where they can be parsed and used to<br>get the roll value.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Text Display </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the various style handling via markdown or special characters</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/230262403-b5aea391-8f92-4fa5-bc47-ee368f0ece75.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Code for processing red and green<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/230262591-0d7e6576-2de4-454a-9b41-c1fe1c9976c8.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Code for processing blue, underline, italic, and bold<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/230262756-59bcae61-d089-4041-9ba2-6b700c7d98ac.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Code for setting up output<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/230262903-28aec104-a910-4d83-890b-f465ac353bf6.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>How output is returned<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show source message and the result output in the terminal (note, you won't actually see the styles until Milestone3)</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/230240826-71889f79-ccfd-4a4d-b13b-9cba55637626.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Output of all individual<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/230264748-d41bc385-6e33-4af4-ae07-a7a969d8fe3e.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Output of all together<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Explain how you got each style applied</td></tr>
<tr><td> <em>Response:</em> <p>The code scans the message looking for the * indicator followed by whatever<br>second modifier is applied for the style. From there it adds the tags<br>needed in the front until where the code detects the closing indicators. There<br>it adds the closing tags. The messages are stored in an array list<br>where they are then converted into strings. After all this, the modified string<br>is outputted. Bold, italic, and underline have their individual html tags which use<br>the same logic. In order to display color, I had to use the<br>same code once again, but for each individual code in a span style<br>tag. Each color was treated individually with its own indicators, allowing for support<br>of RGB.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Include the pull request for Milestone2 to main</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/gbj3/IT114-008/pull/8">https://github.com/gbj3/IT114-008/pull/8</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-chatroom-milestone-2/grade/gbj3" target="_blank">Grading</a></td></tr></table>

<h1>Milestone 3</h1>
<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone3</td></tr>
<tr><td> <em>Student: </em> Gabriel Jastrzebski (gbj3)</td></tr>
<tr><td> <em>Generated: </em> 4/19/2023 9:57:39 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-chatroom-milestone3/grade/gbj3" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Connection Screens </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the screens with the following data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/232925573-e47968cd-20f5-4a1e-8c9b-c38ced27161b.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>host and port UI<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/232925883-24285947-57d4-4fca-b10a-dc5b110c8186.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>username (with no spaces allowed)<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the code for each step of the process</td></tr>
<tr><td> <em>Response:</em> <p>When the user starts the UI, they are prompted with two inputs, host<br>and port. Both are automatically filled, with the host being the IP of<br>the local server and the port being the DNS port of the local<br>server. The user is then prompted to continue where they can input their<br>name. Note, the username cannot contain spaces and must be filled. If those<br>requirements are not met, they will be prompted. With both being done, the<br>user is put into the lobby of the chatroom with a message of<br>them joining being broadcasted to all those in the lobby.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Chatroom view </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/232941053-15514668-2448-4a26-bd1d-30175787bbd4.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>UI with users, chat area, chat history, and button<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/232941271-113c4f40-6493-457a-a6ee-7c1a92523425.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Code snippet allowing for enter key<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Chat Activities </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show screenshots of the result of the following commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/233233240-40093d88-5426-4b5f-83c1-7c4726d3beab.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Gabe does the commands in order, /flip, /roll 2, /roll 2d6<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the code snippets for each command</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/233233520-d82d6fb0-bc78-4326-9170-e5862619a267.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Code for flip and roll commands<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code flow of each command</td></tr>
<tr><td> <em>Response:</em> <p>Flip works by generating an integer between 0 and 1. If the integer<br>is 0, you got heads. If it&#39;s 1, you got tails.&nbsp; Then the<br>message is outputted, however rather than previously, the message is wrapped in bold<br>tags to make it different.&nbsp;<span style="color: rgb(230, 237, 243); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe<br>UI&quot;, &quot;Noto Sans&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;; font-size:<br>16px; background-color: rgb(22, 27, 34);">Roll works by splitting the message into an array<br>split by a space.&nbsp;</span><span style="color: rgb(230, 237, 243); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;,<br>&quot;Noto Sans&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;; font-size: 16px;<br>background-color: rgb(22, 27, 34);">It then looks at the second index (where the format<br>would be decided)&nbsp;</span><span style="color: rgb(230, 237, 243); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, &quot;Noto<br>Sans&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;; font-size: 16px; background-color:<br>rgb(22, 27, 34);">and tries to parse it. If it can, that means it&#39;s<br>an integer&nbsp;</span><span style="color: rgb(230, 237, 243); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, &quot;Noto Sans&quot;,<br>Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;; font-size: 16px; background-color: rgb(22,<br>27, 34);">and therefore it is in the /roll # format. Then just do<br>the&nbsp;</span><span style="color: rgb(230, 237, 243); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, &quot;Noto Sans&quot;, Helvetica,<br>Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;; font-size: 16px; background-color: rgb(22, 27,<br>34);">math and output. If it can&#39;t, it is in the other format. It&nbsp;</span>&lt;span<br>style=&quot;color: rgb(230, 237, 243); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, &quot;Noto Sans&quot;, Helvetica, Arial,<br>sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;; font-size: 16px; background-color: rgb(22, 27, 34);&quot;&gt;then<br>splits into two parts by looking for the d character. Those values&nbsp;</span><span style="color:<br>rgb(230, 237, 243); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, &quot;Noto Sans&quot;, Helvetica, Arial, sans-serif,<br>&quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;; font-size: 16px; background-color: rgb(22, 27, 34);">are stored<br>in an array where they can be parsed and used to&nbsp;</span><span style="color: rgb(230,<br>237, 243); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, &quot;Noto Sans&quot;, Helvetica, Arial, sans-serif, &quot;Apple<br>Color Emoji&quot;, &quot;Segoe UI Emoji&quot;; font-size: 16px; background-color: rgb(22, 27, 34);">get the roll<br>value. Once again, surrounded by bold tags. The message is generated by the<br>client, sent to the server to compute and run the method, then sent<br>back to the client to have them be the ones who sent the<br>message.</span><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Custom Text </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Screenshots of examples</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/233154235-04452910-3b90-41a3-b00d-10d901b32e9a.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Chat panel when the user uses bold, italic, color, and underline individually. Terminal<br>to the left shows the users input to achieve each effect.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/233237989-b71480f7-be38-4d81-acfc-bf81df3070c5.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Chat panel with all used together, Terminal to the left shows user input<br>to achieve it<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how you got the UI side to render the text accordingly</td></tr>
<tr><td> <em>Response:</em> <p>I got the UI to properly read the text by editing ChatPanel&#39;s addText<br>method. The issue is the line reading &quot;<span style="font-family: Consolas, &quot;Courier New&quot;, monospace;<br>white-space: pre; color: rgb(78, 201, 176);">JEditorPane</span><span style="background-color: rgb(30, 30, 30); color: rgb(212, 212,<br>212); font-family: Consolas, &quot;Courier New&quot;, monospace; white-space: pre;"> </span><span style="font-family: Consolas, &quot;Courier New&quot;,<br>monospace; white-space: pre; color: rgb(156, 220, 254);">textContainer</span><span style="background-color: rgb(30, 30, 30); color: rgb(212,<br>212, 212); font-family: Consolas, &quot;Courier New&quot;, monospace; white-space: pre;"> = </span><span style="font-family: Consolas,<br>&quot;Courier New&quot;, monospace; white-space: pre; color: rgb(197, 134, 192);">new</span><span style="background-color: rgb(30, 30, 30);<br>color: rgb(212, 212, 212); font-family: Consolas, &quot;Courier New&quot;, monospace; white-space: pre;"> </span><span style="font-family:<br>Consolas, &quot;Courier New&quot;, monospace; white-space: pre; color: rgb(220, 220, 170);">JEditorPane</span><span style="background-color: rgb(30, 30,<br>30); color: rgb(212, 212, 212); font-family: Consolas, &quot;Courier New&quot;, monospace; white-space: pre;">(</span><span style="font-family:<br>Consolas, &quot;Courier New&quot;, monospace; white-space: pre; color: rgb(206, 145, 120);">&quot;text/plain&quot;</span><span style="background-color: rgb(30, 30,<br>30); color: rgb(212, 212, 212); font-family: Consolas, &quot;Courier New&quot;, monospace; white-space: pre;">, </span>&lt;span<br>style=&quot;font-family: Consolas, &quot;Courier New&quot;, monospace; white-space: pre; color: rgb(156, 220, 254);&quot;&gt;text</span><span style="background-color: rgb(30,<br>30, 30); color: rgb(212, 212, 212); font-family: Consolas, &quot;Courier New&quot;, monospace; white-space: pre;">);&quot;<br>where the UI is told to not properly read html tags but rather<br>treat them as regular text. This is subsidized by changing plain to html.<br>With that done, the UI will recognize the tags and do the effects<br>needed.</span><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 5: </em> Whisper </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing a demo of whisper commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/233226258-902d4161-3ccb-469a-a2a7-dc2fe930a754.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows the private message being sent with only the two involved seeing the<br>message<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the server-side code snippets of how this feature works</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/233226439-934e3b80-3a87-4887-8239-123896267165.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>How target of whisper is found and who to send to<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/233226531-125905aa-4433-4e98-ab44-12595997dd82.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Method for sending the message<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <p>This was done by making another method that would send the message to<br>the user would provide. This is done by parsing the message and finding<br>who was put after the &quot;@&quot;. Once this was done, the message would<br>be sent to that user, and that user only.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 6: </em> Mute/Unmute </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots demoing this feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/232944143-699142b1-b2c8-4780-a2dd-bf8cdec18d77.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Gabe mutes/unmutes Joe. Gabe cannot see messages from joe when he mutes him,<br>but can see them when he unmutes him. Jake can see all the<br>messages sent since he has not muted anyone<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshots of the code snippets that achieve this feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/232945185-ed08783b-2720-4974-a326-43bbe2c913e6.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Serverthread methods for muting/unmuting<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/232945401-d146a6fe-05b3-4e98-aab5-725e95c7def6.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Room processing the command through /mute /unmute<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/232947266-eb384135-48c2-4028-889d-b697cd55fd9f.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Modified sendMessage<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <p>ServerThread houses the main methods where the string array for muted clients can<br>be found. The room then scans for the commands with a comma separating<br>names, allowing for multiple people to be muted at one time. The person<br>muted is then added to the array list. sendMessage method is then modified<br>with an if statement checking to see if the sender of the message<br>is muted, if so, do not send it to the client that muted<br>them. Otherwise, send it to all in the room.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 7: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Pull request from milestone3 to main</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/gbj3/IT114-008/pull/9">https://github.com/gbj3/IT114-008/pull/9</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-chatroom-milestone3/grade/gbj3" target="_blank">Grading</a></td></tr></table>

<h1>Milestone 4</h1>
<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone4</td></tr>
<tr><td> <em>Student: </em> Gabriel Jastrzebski (gbj3)</td></tr>
<tr><td> <em>Generated: </em> 5/5/2023 1:22:31 AM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-chatroom-milestone4/grade/gbj3" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Client can export chat history of their current session (client-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot of related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/236101421-e45961b8-bc5d-4c76-bcb1-eda9bd5a5218.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>ClientUI with Export button<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot of exported data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/236101150-3103aabe-04fc-42c4-9a87-e4ba08b5b03b.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Messages captured with roll and flip command having bolding<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <div>The code first creates a StringBuilder object named 's' and retrieves all the<br>components from the chat panel using the getComponents() method of chatPanel.chatArea. It then<br>iterates through each component in the comp array and checks if it is<br>an instance of JEditorPane. If it is, the text content of the JEditorPane<br>is appended to the StringBuilder object 's'. The code then attempts to create<br>a FileWriter object to create a new file named "chat.txt" and writes the<br>contents of the StringBuilder object 's' to the file using a BufferedWriter object<br>named 'bw'. Finally, it logs the contents of the StringBuilder object 's' and<br>catches any IOExceptions that may occur during the file export process, logging the<br>error message "No can do" in case of failure.</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Client's mute list will persist across sessions (server-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot of how the mute list is stored</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/235815194-3b8e2992-a04c-40ec-a85d-7a09d84c9002.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Gabe mutes Jack<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/235815367-0503d151-7e98-4db7-9c5d-b173276ee5b4.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>File made after muting<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/235815954-9a1a22be-8be1-4e97-bb12-5a8b387f9e94.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>After server is restarted and same client names join<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the code saving/loading mute list</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/235816459-b84b0810-1ce4-4cc8-b3f9-fa1444b64693.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Code that saves/loads mute list. loadMuteList called in Server.java in the joinRoom method.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>The first method, saveMuteList(), concatenates the name of the client and a comma-separated<br>list of muted clients into a string called &#39;data&#39;. It then attempts to<br>create a new file with the client&#39;s name as the filename and writes<br>the &#39;data&#39; string to the file using a BufferedWriter object named &#39;bw&#39;.&nbsp;The second<br>method, loadMuteList(), first checks if a file exists with the client&#39;s name as<br>the filename. If the file exists, it reads the contents of the file<br>and concatenates each line of text into a single string called &#39;dataFromFile&#39;. It<br>then removes the client&#39;s name from the beginning of the string by finding<br>the first space character and taking the substring after it. If the resulting<br>string is not empty, it splits the string into a list of muted<br>client names and adds each client to the mutedClients list by calling the<br>mute() method. Finally, it logs the contents of the mutedClients<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Client's will receive a message when they get muted/unmuted by another user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot showing the related chat messages</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/235567491-dcb15824-a201-4bbe-9ad3-f82a503e23c8.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>User1 mutes/unmutes User2<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the related code snippets</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/235816686-00adb44c-be04-4388-a63d-1e8b16713bcf.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Mute and unmute message found in switch command<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>A private message is sent in the case of muting/unmuting to the user<br>that is being muted/unmuted. This way the message is not broadcasted to everyone<br>and even further, since the mute method is first checked before remuting someone<br>already muted, it does not allow for spamming.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> User list should update per the status of each user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707834-bf5a5b13-ec36-4597-9741-aa830c195be2.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot for Muted users by the client should appear grayed out</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> (missing)</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot for Last person to send a message gets highlighted</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> (missing)</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>I never got this :/<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-chatroom-milestone4/grade/gbj3" target="_blank">Grading</a></td></tr></table>