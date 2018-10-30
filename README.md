# DarkSkyAPIWrapper
Repository for Dark Sky API Wrapper written in java
#Usage 1

        String requestBuilder = new RequestBuilder
        .Builder("KEY KEY KEY KEY", 37.8267f, -122.4233f)
        .build();
        Forecast forecast = new Request().getForecast(requestBuilder);
        System.out.println(forecast.getTimezone());
        System.out.println(forecast.getLatitude());
        System.out.println(forecast.getLongitude());
        System.out.println(forecast.getHourly().getData().get(0).getApparentTemperature());
        System.out.println(forecast.getHourly().getData().get(0).getTemperature());
        
        
       
#Usage 2

        String requestBuilder = new RequestBuilder
                .Builder("KEY KEY KEY KEY", 37.8267f, -122.4233f)
                .excludes(Exclude.Currently,Exclude.Daily)
                .units(Units.Uk2)
                .language(Language.Danish)
                .extendHourly(true)
                .timeMachine(Instant.now())
                .build();
                
        Forecast forecast = new Request().getForecast(requestBuilder);
