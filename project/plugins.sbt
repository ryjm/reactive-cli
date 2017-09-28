val Versions = new {
  val sbtHeader     = "3.0.1"
  val sbtSalaNative = "0.3.3"
  val sbtSclariform = "1.8.0"
}

addSbtPlugin("de.heikoseeberger"  % "sbt-header"        % Versions.sbtHeader)
addSbtPlugin("org.scala-native"   % "sbt-scala-native"  % Versions.sbtSalaNative)
addSbtPlugin("org.scalariform"    % "sbt-scalariform"   % Versions.sbtSclariform)
