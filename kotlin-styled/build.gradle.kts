plugins {
    kotlin("js")
    `npm-publishing-conventions`
}

dependencies {
    implementation(project(":kotlin-extensions"))
    implementation(project(":kotlin-css:kotlin-css-js"))
    implementation(project(":kotlin-react"))
    implementation(project(":kotlin-react-dom"))
}
