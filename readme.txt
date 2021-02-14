==================================
build commands
==================================

mvn compile jib:dockerBuild
skaffold init --skip-build --force

*** ADD JIB CONFIG ***
to point skaffold to the local docker image built by Jib, add the below to the generated skaffold.yaml
******************

build:
  tagPolicy:
    sha256: {}
  artifacts:
    - image: dave/calculator-service
      context: .
      jib: {}

  local:
    push: false     # Set true to a push built images to remote Docker repository


skaffold dev --port-forward
skaffold delete