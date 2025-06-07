plugins {
    id("generatorbuild.karakum-conventions")
}

dependencies {
    jsMainImplementation(npmStrict("@types/node"))
}
