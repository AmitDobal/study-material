# Learning

Personal study repository for software engineering topics — Java, JavaScript, Low Level Design (LLD), High Level Design (HLD), and related concepts.

## Repository Structure

```
learning/
├── java_learning/          # Java & LLD practice
│   └── lld/
│       ├── design_patterns/   # Design pattern implementations
│       └── problems/          # LLD problem solutions
├── javascript/             # JavaScript concepts & exercises
└── README.md
```

## Topics

### JavaScript

Hands-on notes and examples for core JavaScript concepts.

| File | Topic |
|------|-------|
| `javascript/1_clousre.js` | Closures |
| `javascript/2_this_keyword.js` | `this` keyword |
| `javascript/abc.js` | Misc practice |

Run any file with Node.js:

```bash
node javascript/1_clousre.js
```

### Java — Low Level Design (LLD)

#### Design Patterns

| Category | Pattern | Location |
|----------|---------|----------|
| Behavioral | Chain of Responsibility | `java_learning/lld/design_patterns/behavioral/chain_of_responsibility/` |
| Behavioral | Strategy | `java_learning/lld/design_patterns/behavioral/strategy/` |
| Structural | Adapter | `java_learning/lld/design_patterns/structural/adaptor/` |

#### LLD Problems

| Problem | Description | Location |
|---------|-------------|----------|
| Parking Lot | Entry/exit flows, slot assignment, pricing, payments | `java_learning/lld/problems/parkinglot/` |

The parking lot solution covers entities, DTOs, repositories, services, controllers, strategy-based pricing, and custom exceptions. See `doc.txt` inside the problem folder for flow and implementation notes.

### High Level Design (HLD)

Notes and designs for system-level topics (scalability, databases, caching, messaging, etc.) will live here as they are added.

## How to Use

- Open the project in IntelliJ IDEA (`.iml` module files are included).
- Java files are organized by topic — browse `design_patterns/` for patterns and `problems/` for full LLD exercises.
- JavaScript files are numbered by topic; run them individually with Node.js.
- Add new topics as sibling folders or files following the existing naming conventions.

## Planned Areas

- [ ] More LLD problems (e.g. elevator, book my show, splitwise)
- [ ] HLD notes and diagrams
- [ ] Additional design patterns (creational, more behavioral/structural)
- [ ] Java core & Spring Boot notes
- [ ] Data structures & algorithms
