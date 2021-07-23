plugins {
    kotlin("js")
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-extensions"))
    api(project(":kotlin-css"))
    api(project(":kotlin-react"))
    api(project(":kotlin-react-dom"))

    api(kotlinxHtml("js"))

    api(npm("css-in-js-utils", "^3.1.0"))
    api(npm("inline-style-prefixer", "^6.0.0"))
}

repositories {
    gradlePluginPortal()
    mavenLocal()
    mavenCentral()
    maven {
        url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
    maven {
        url = uri("https://packages.jetbrains.team/maven/p/ui/dev")
    }
    maven { url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-js-wrappers") }
}