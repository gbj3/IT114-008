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