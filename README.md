# Code Eva : REST API

An automated programming assignment evaluator

## Requirements

- JDK 17
- Gradle
- Docker
- Docker Compose

# Installation

1. Clone the repository
2. Run `docker-compose up -d` to start the database
3. Run `gradle bootRun` to start the application

## How to contribute

1. Get latest of main branch
```bash
git pull origin main
```

2. Create a new branch
```bash
git checkout -b fea/<feature-name> # for new features and enhancements
git checkout -b bug/<bug-name>     # for bug fixes
```

3. After the changes have been made, commit the changes.
> Makes sure only to add necessary files.
```bash
# check the git status
git status

# add files
git add <files-to-add>
git add src/main/java/com/codeeva/codeeva/controllers/UserController.java # example

# check the git status
git status

# commit
git commit -m "commit message"
```

4. Push the branch to remote
```bash
git push origin <branch-name>
```

5. Make a pull request from Github
