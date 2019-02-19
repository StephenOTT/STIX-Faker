# STIX-Faker

Generate Fake STIX 2 Json Data.

# Deploy

`java -jar stix-faker-0.5.jar`

Go to: `localhost:8080`

# API

All Bundleable Objects (SDO, SRO, Data Marking's Marking Definition) and a Bundle itself can be generated through the REST API:

First load will be slower as it is warming up in the JVM.


## Bundle

GET `/api/bundle`


## SDO / Stix Domain Objects

### Attack-Pattern

GET `/api/sdo/attack-pattern`

### Campaign

GET `/api/sdo/campaign`

### Course-of-Action

GET `/api/sdo/course-of-action`

### Indicator

GET `/api/sdo/indicator`

### Intrusion-Set

GET `/api/sdo/intrusion-set`

### Malware

GET `/api/sdo/malware`

### Observed-Data

GET `/api/sdo/observed-data`

### Report

GET `/api/sdo/report`

### Threat-Actor

GET `/api/sdo/threat-actor`

### Tool

GET `/api/sdo/tool`

### Vulnerability

GET `/api/sdo/vulnerability`


## SRO / Stix Relationship Objects

### Relationship

GET `/api/sro/relationship`

### Sighting

GET `/api/sro/sighting`


## Data Marking

### Marking Definition

GET `/api/data-marking/marking-definition`