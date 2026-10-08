# NexusPay Core Engine

A robust, decoupled transaction processing engine designed under Clean Architecture and SOLID principles using **Java 17+**.

## Key Architectural Patterns
- **Dependency Inversion Principle (DIP):** Loosely coupled payment processors through the `ProcesadorPagos` contract.
- **Immutability & Safety:** Thread-safe state preservation utilizing native Java `record` for transaction models (`Transaccion`).
- **Defensive Programming (Fail-Fast):** Strict domain invariant validation guarding against null references and non-positive monetary values.
- **Pluggable Auditing:** Extensible audit pipeline (`ProcesadorPagosAuditado`) without breaking client service logic (`ServicioTransferencias`).

## Tech Stack
- **Language:** Java 17+
- **Paradigms:** Object-Oriented Programming (OOP), SOLID, Clean Code