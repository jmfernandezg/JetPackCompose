plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.21"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:31.1-jre")
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useKotlinTest("1.8.21")
        }
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

application {
    mainClass.set("com.jmfg.training.jetpack.compose.AppKt")
}
