plugins {
    kotlin("js")
    `publishing-conventions`
}

dependencies {
    implementation(project(":kotlin-extensions"))
    implementation(project(":kotlin-react"))
    implementation(project(":kotlin-redux"))
}
