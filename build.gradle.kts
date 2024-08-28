plugins {
    `idea`
    `java`
    `java-library`
    `java-test-fixtures`
    `maven-publish`
}

group = "io.spbx"
version = "0.1.1"

tasks.wrapper {
    gradleVersion = "8.10"
    jarFile = projectDir.resolve("gradle/wrapper/gradle-wrapper.jar")
    scriptFile = projectDir.resolve("gradle/wrapper/gradlew")
}

idea {
    module {
        outputDir = buildDir.resolve("idea/main")
        testOutputDir = buildDir.resolve("idea/test")
        isDownloadJavadoc = false
        isDownloadSources = true
    }
}

private val main by sourceSets
private val gen by sourceSets.creating

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    compileOnly("org.jetbrains:annotations:24.1.0")
}

dependencies {
    "genImplementation"(main.output)
    "genCompileOnly"("org.jetbrains:annotations:24.1.0")
    "genImplementation"("com.carrotsearch:hppc:0.10.0")
}

dependencies {
    testFixturesImplementation(gen.output)

    testFixturesImplementation("com.google.flogger:flogger:0.8")
    testFixturesImplementation("com.google.truth:truth:1.4.2")
    testFixturesImplementation("org.junit.jupiter:junit-jupiter-api:5.10.2")

    testFixturesImplementation("org.jetbrains:annotations:24.1.0")
    testFixturesImplementation("com.carrotsearch:hppc:0.10.0")
    // testFixturesImplementation(testFixtures("com.github.maxim5:java-basics:0.1.2"))  // jitpack.io bug
    testFixturesImplementation("com.github.maxim5:java-basics:0.1.2:test-fixtures")
}

dependencies {
    testImplementation(gen.output)

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.2")

    testCompileOnly("org.jetbrains:annotations:24.1.0")
    testCompileOnly("com.google.errorprone:error_prone_annotations:2.28.0")
    testImplementation("com.google.truth:truth:1.4.2")

    testImplementation("com.carrotsearch:hppc:0.10.0")
    testImplementation("com.github.maxim5:java-basics:0.1.2:test-fixtures")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<Jar> {
    from(main.output)
    from(gen.output)
    // See also
    // https://stackoverflow.com/questions/59401271/how-to-exclude-resources-from-the-jar-in-gradle-and-also-run-via-intellij
    exclude("**/templates**")
    manifest {}
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = project.group.toString()
            artifactId = "prima"
            version = project.version.toString()

            from(components["java"])
        }
    }
}
