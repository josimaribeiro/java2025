@echo off
:: Cria README.md com título formatado
echo # Projeto Java 2025 > README.md
echo. >> README.md
echo ## Informações do sistema >> README.md
echo - Nome do computador: %COMPUTERNAME% >> README.md
echo - Usuário: %USERNAME% >> README.md
echo - Data e hora: %date% %time% >> README.md
echo. >> README.md
echo ## Descrição >> README.md
echo Este projeto foi iniciado automaticamente com um script em Windows CMD. >> README.md
echo. >> README.md
echo ## Autor >> README.md
echo Josimar Ribeiro >> README.md
echo. >> README.md

:: Inicializa o repositório Git
git init

:: Adiciona os arquivos ao stage
git add .

:: Faz o primeiro commit
git commit -m "first commit"

:: Cria a branch main
git branch -M main

:: Adiciona o repositório remoto
git remote add origin git@github.com:josimaribeiro/java2025.git

:: Faz push para o repositório remoto
git push -u origin main

pause
