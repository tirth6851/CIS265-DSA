# Rule: Clean Up Java Build Artifacts After Verification

When compiling Java source files (e.g., via `javac`) to verify code correctness, always clean up generated `.class` files from the workspace directory if single-file Java execution (`java SourceFile.java`) is being used.

- **Why**: Existing `.class` files in the current working directory prevent `java SourceFile.java` from picking up subsequent source code changes, causing stale bytecode execution.
- **Action**: Clean up `.class` files after test compilation or advise explicit recompilation with `javac`.
