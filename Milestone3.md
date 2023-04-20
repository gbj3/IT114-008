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