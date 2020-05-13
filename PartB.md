Total 6 Teams A, B, C, D, E and F  
Restructuring  
   1. Team A - Client Facing  
   2. Team B - UI Team  
   3. Team C, D and E - Development Teams  
   4. Team F - DevOps Team


Roles:  
   The below roles will be needed  
   1. Ux Designer
   2. Team Lead (Per Team)
   3. Product Owner
   4. Manager


Responsibilities (Teams):  
   1. Team A  
      1. Team A depends on teams B to F and will work closely will all the teams.
      2. Team A will maintain per client code base. This makes it easy to make customizations.
      3. Every customization needs to be discussed with the architect, product owner and Ux Designer and a call needs to be taken if it is customer specific or generic.
      4. If generic, requirement will be added to product backlog and planned in the sprint releases.
   2. Team B
      1. Responsible for the Product UI
      2. Team B will work closely with all teams and will maintain well defined UI guidelines
      3. Responsible to come up with Mockups/Wireframes and css/styling
   3. Teams C, D, E
      1. These are development teams. Responsible for all implementation and testing of microservices
      2. Responsible for the documentation of microservices. Can use a tool such as Swagger for documentaion of microservices.
      3. Responsible for following development best practices to produce production quality code
   4. Team F
      1. This will be the DevOps Team
      2. Responsible for CI/CD
      3. Responsible for configuring, integration, setting up servers, databases
      4. Responsible for builds and pipleline configuration in Jenkins
      5. Responsible for enabling the development teams to carry out their activities smoothly
 
 
Responsibilities (Individual)
   1. Architect 
      1. Responsible for design, scaling and simplicity of the implementation
      2. Responsible for overall code Quality of the project
      3. Responsible for exploration of new tools and technologies and recommending the best tool/technology to use for faster           development
   2. Product Owner
      1. Responsbile for interacting with clients/customers and gathering requirements of value
      2. Creating and maintaining the product backlog with priority
      3. Responsbible for defining requirements and breaking them into user stories and explaining the same to teams
      4. Defining acceptance criteria of user stories
      5. Needs to work closely with development and Ui teams to ensure the functionality is developed and the acceptance criteria is met
      6. Can act as Scrum Master for Daily Scrum
   3. Ux Designer
      1. Responsible for the overall look and feel of the product.
      2. Needs to work closely with UI team and implementation teams to deliver intuitive and usable UI
   4. Manager:
      1. Responsible for the complete planning, estimation and delivery of the project
      2. Responsible for optimizing costs and delivering project under budget
      3. Responsbile for Hiring, Maintaining and Motivating the team members
      4. Responsible for the overall technical needs, infrastruture needs of the teams
      5. Responsible for mentoring and providing technical guidance to the teams
      6. Responsible for stakeholder management
      7. Responsible for people management and appraisals
   5. Technical Lead
      1. Responsible for taking the sprint user stories to closure
      2. Providing Technical guidance to team members
      3. Responsible for ensuring development best practices in accordance with the defined guidelines
      4. Responsible for highlighting any risk and coming with a mitigation plan
 
 Processes:
   1. Development  
      1. Development teams will use Git based solutions for code respository.  
      2. Code commits needs to be done judiciously so that Team A can take the complete commit or decide to ignore. Changes for one bug or feature need to go under one commit.  
      3. The changes and design need to be captured so that it helps Team A understand the impact and avoid unknown surprises.  
      4. CI/CD will be integrated with unit tests, Sonar and automation suite which will generate daily coverage report, code quality report and automation report.  
      5. End of Every Sprint,there will be a demo to product owner and client. This needs to be signed off by Architect, Product Owner and Ux Designer.  
      6. Development teams C,D,E will have individual integration servers for microservices and the daily integrated build will be deployed on one common server for validation.  
      7. Security testing and Performance testing needs to be included in the development plan from the start  
      8. Code Coverage for unit tests >= 85 %  
      9. Only Minor SonarQube issues allowed. No Critical/Major issues.  
      10. Code Reviews and capturing code review comments in Git based solution or ReviewBoard  
      11. Sunset period for rest api's will be 3 months or lesser as per the acceptable criteria  
      12. Maintaining a wiki for the project which will be a goto for all sorts of issues, clarifications and understanding  
   2. Agile  
      1. Teams will follow Agile.  
      2. There will be Releases. Each Release will have a biweekly Sprint. Each Sprint will have user stories and/or issues to address.  
      3. Teams can use Jira or any suitable Project Management Tool to track the progress of Each Sprint and Release and maintance of the product backlog.  
      4. There will be sprint planning where the team will participate and use agile poker to assign story points to user stories  
      5. There will be a Sprint retrospective within team and across teams. What Went Well, What didn't go well, Things to improve, Things to continue needs to be discussed and captured in the Project Management Tool.  
      6. There will be daily scrum and srcum of srcums.  
      7. Need to have a communication tool such as Microsoft teams for better collaboration  
      8. Teams need to arrive at a sprint velocity number and constantly try to better this velocity through innovative means  
