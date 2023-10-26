# Software_Oblig_3_Testing
# Oblig 3 - git og continuous integration
Dette repositoryet innholder koden og testene fra oblig 2, og Github action blir brukt for å automatisk teste med Maven.

## Github action
- Lagde dir .github og workflows med en yml fil i seg /maven.yml
- Inne i filen:
- name: blir brukt som referanse og vises til i github action
- on: Workflowen vil starte når en push skjer til main branch
- jobs: alle jobbene som skal utføres
- build: navnet på jobben
- runs-on: velger type virituell maskin jobben skal bli kjørt på.
- steps: liste over alt som skal utføres av jobben
- actions/checkout@v4 brukes for å trekke inn kode fra repository til VM
- actions/setup-java@v3 setter opp jdk
- with: med versjon 20
- distribution: angir hvilket distrubusjon av JDK
- run: Denne handlingen bruker Maven til å bygge prosjektet. Den kjører mvn package-kommandoen med flagget -B for å kjøre byggeprosessen uten å vise utførlig utdata.

## Lenke til Github-Repo
https://github.com/BrothaZylo/Software_Oblig_3_git_og_continuous_integration
