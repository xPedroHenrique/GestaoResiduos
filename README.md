# Gestão de Resíduos – Etapa 2 (Android, Kotlin)

MVP funcional com Login -> Home -> (Calendário, Mapa, Educação). Inclui TDD (unit test) e teste UI (Espresso).

## Como abrir
1. Android Studio > Open > selecione a pasta `GestaoResiduosEtapa2`.
2. Sincronize o Gradle.
3. Rode o app no emulador (API 26+).

## Testes
- Unitários: `ValidacaoTest` (JUnit) — `emailValido` e `emailInvalido`.
- UI: `SmokeUiTest` (Espresso) — abre a tela de Login sem crash.

Execute: **Run > Run All Tests**.

## Evidências para Relatório (Etapa 2)
- Prints: telas Login, Home, Calendário, Mapa, Educação.
- Print dos testes passando (JUnit + Espresso).
- Link do repositório Git.
- Dashboard do ClickUp com Sprint final concluída.

## Estrutura
- `ui/` Activities com ViewBinding.
- `data/` modelos e repositório de coletas (mock, facilmente trocável por API/DB).
