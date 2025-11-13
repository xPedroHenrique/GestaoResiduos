# Gestão de Resíduos – Etapa 2
Aplicação Mobile (Android / Kotlin) com TDD + Testes UI (Espresso)

Este repositório contém o MVP desenvolvido para a Etapa 2 do projeto de Programação Mobile, seguindo boas práticas como arquitetura simples, ViewBinding, Google Maps, Test-Driven Development (TDD) e testes automatizados utilizando JUnit e Espresso.

O objetivo do app é fornecer uma interface simples para a comunidade visualizar informações úteis sobre calendário de coleta, educação ambiental e mapa da cidade de Tijucas (SC) — tudo construído de forma orientada a testes.

## Tecnologias Utilizadas
 -  Android SDK (API 26+)
 -  Kotlin
 -  ViewBinding
 - Google Maps SDK
 - JUnit (Testes Unitários)
 - Espresso (Testes de UI)
 - Gradle Kotlin DSL

## Estrutura do Projeto
app/
└── src/
    ├── main/
    │   ├── java/com/pedro/gestaoresiduos
    │   │   ├── ui/
    │   │   │   ├── login/        → LoginActivity
    │   │   │   ├── home/         → HomeActivity
    │   │   │   ├── educativo/    → EducativoActivity
    │   │   │   ├── calendario/   → CalendarioActivity
    │   │   │   └── mapa/         → MapaActivity (Google Maps)
    │   │   ├── util/             → Validacao.kt
    │   │   └── model/            → Dados mockáveis
    │   └── res/                  → Layouts, strings, cores, etc.
    ├── test/                     → Testes unitários (JUnit)
    └── androidTest/              → Testes de interface (Espresso)

## Funcionalidades Implementadas
1 - Login
  - Validação de e-mail (Validacao.validarEmail)
  - Senha mínima com 4 caracteres
  - Navegação para Home em caso de sucesso
  - Toast para credenciais inválidas

2 - Home
  - Calendário
  - Educação Ambiental
  - Mapa (Google Maps)
