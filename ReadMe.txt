#Health check
http://localhost:8080/actuator
http://localhost:8080/actuator/health/liveness
http://localhost:8080/actuator/health/readiness

{
   "_links":{
      "self":{
         "href":"http://localhost:8080/actuator",
         "templated":false
      },
      "health":{
         "href":"http://localhost:8080/actuator/health",
         "templated":false
      },
      "health-path":{
         "href":"http://localhost:8080/actuator/health/{*path}",
         "templated":true
      },
      "info":{
         "href":"http://localhost:8080/actuator/info",
         "templated":false
      }
   }
}

#######Json response is OK
http://localhost:8080/actuator/health

{   
    "status": "UP",
    "components": {
        "db": {
            "status": "UP",
            "details": {
                "database": "Microsoft SQL Server",
                "validationQuery": "isValid()"
            }
        },
        "diskSpace": {
            "status": "UP",
            "details": {
                "total": 255400603648,
                "free": 25881235456,
                "threshold": 10485760,
                "exists": true
            }
        },
        "jobExecutor": {
            "status": "UP",
            "details": {
                "jobExecutor": {
                    "name": "JobExecutor[org.camunda.bpm.engine.spring.components.jobexecutor.SpringJobExecutor]",
                    "lockOwner": "56da8010-e487-4d18-a8c8-e1c5fe6d428f",
                    "lockTimeInMillis": 300000,
                    "maxJobsPerAcquisition": 3,
                    "waitTimeInMillis": 5000,
                    "processEngineNames": [
                        "default"
                    ]
                }
            }
        },
        "livenessState": {
            "status": "UP"
        },
        "ping": {
            "status": "UP"
        },
        "processEngine": {
            "status": "UP",
            "details": {
                "name": "default"
            }
        },
        "rabbit": {
            "status": "UP",
            "details": {
                "version": "3.9.3"
            }
        },
        "readinessState": {
            "status": "UP"
        }
    },
    "groups": [
        "liveness",
        "readiness"
    ]
}