// This is a non complaint solution


class SecurityIOException extends IOException {/* ... */};
 
try {
  FileInputStream fis =
      new FileInputStream(System.getenv("APPDATA") + args[0]);
} catch (FileNotFoundException e) {
  // Log the exception
  throw new SecurityIOException();
}


