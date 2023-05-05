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