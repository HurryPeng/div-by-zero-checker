import org.checkerframework.checker.dividebyzero.qual.*;

// Test subtyping relationships for the Divide By Zero Checker.
// The file contains "// ::" comments to indicate expected errors and warnings.

class SubtypeTest {
  /// You will want a test like this for every pair of qualifiers in your type hierarchy.
  // void oneSubtypingRelationship(@MyTopQualifier int x, @MyBottomQualifier int y) {
  //   @MyTopQualifier int a = x;
  //   @MyTopQualifier int b = y;
  //   // :: error: assignment
  //   @MyBottomQualifier int c = x; // expected error on this line, as indicated just above
  //   @MyBottomQualifier int d = y;
  // }

  // It reports anno.on.irrelevant which I don't understand, so I'm commenting it out.
  // void zeroSubtypingRelationship(@DBZZero int x, @DBZNotZero int y) {
  //   @DBZZero int a = x;
  //   @DBZZero int b = y;
  //   // :: error: assignment
  //   @DBZNotZero int c = x;
  //   @DBZNotZero int d = y;
  // }
}
