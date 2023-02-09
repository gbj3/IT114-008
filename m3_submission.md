<table><tr><td> <em>Assignment: </em> IT114 - Number Guesser</td></tr>
<tr><td> <em>Student: </em> Gabriel Jastrzebski (gbj3)</td></tr>
<tr><td> <em>Generated: </em> 2/9/2023 6:48:35 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-number-guesser/grade/gbj3" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create the below branch name</li><li>Implement the NumberGuess4 example from the lesson/slides</li><li>Add/commit the files as-is from the lesson material (this is the base template)</li><li>Pick two (2) of the following options to implement</li><ol><li>Display higher or lower as a hint after a wrong guess</li><li>Implement anti-data tampering of the save file data (reject user direct edits)</li><li>Add a difficulty selector that adjusts the max strikes per level</li><li>Display a cold, warm, hot indicator based on how close to the correct value the guess is (example, 10 numbers away is cold, 5 numbers away is warm, 2 numbers away is hot; adjust these per your preference)</li><li>Add a hint command that can be used once per level and only after 2 strikes have been used that reduces the range around the correct number (i.e., number is 5 and range is initially 1-15, new range could be 3-8 as a hint)</li><li>Implement separate save files based on a "What's your name?" prompt at the start of the game</li></ol><li>Fill in the below deliverables</li><li>Create an m3_submission.md file and fill in the markdown from this tool when you're done</li><li>Git add/commit/push your changes to the HW branch</li><li>Create a pull request to main</li><li>Complete the pull request</li><li>Grab the link to the m3_submission.md from the main branch and submit that direct link to github</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Implementation 1 (one of the picked items) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Two Screenshots: Add a screenshot demonstrating the feature during runtime; Add a screenshot (or so) of the snippets of code that implement the feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/217926661-7055e99d-dc0c-44fc-b820-67996baa83bd.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Checks to see whether a guess was higher or lower than the correct<br>number based on an if else statement.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/217927080-616007b4-76e1-44b7-a3e7-4437d14e0708.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Output showing that the higher/lower code works.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the logic behind your implementation</td></tr>
<tr><td> <em>Response:</em> <p>In the processGuess method I added an if/else statement that checks if the<br>guess was higher than the number. If so, the code prompts the user<br>of this. Otherwise, it says that it is too low. It is after<br>the win case so it does not print even if the correct answer<br>is guessed.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Implementation 2 (one of the picked items) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Two Screenshots: Add a screenshot demonstrating the feature during runtime; Add a screenshot (or so) of the snippets of code that implement the feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/217963497-d2be3e8a-1a42-4c6f-a04b-c4cc508ef544.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Output showing the level difficulty with misinput<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/95941532/217963627-439db293-170b-4e2d-af57-53e12586c77c.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Method that changes the number of strikes allowed<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the logic behind your implementation</td></tr>
<tr><td> <em>Response:</em> <p>A difficulty method that changes the number of strikes allowed based on a<br>users input. If they enter an input not part of the three listed,<br>they are prompted again. Furthermore, I made it not case sensative. The method<br>is then called in the start method.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a link to the related pull request of this hw</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/gbj3/IT114-008/pull/5">https://github.com/gbj3/IT114-008/pull/5</a> </td></tr>
<tr><td> <em>Sub-Task 2: </em> Discuss anything you learned during this lesson/hw or any struggles you had</td></tr>
<tr><td> <em>Response:</em> <p>I originally made the difficulty method using only if statements, but it caused<br>it to only work when choosing hard mode. Once I switched it if<br>else, I fixed the logic issue.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-number-guesser/grade/gbj3" target="_blank">Grading</a></td></tr></table>