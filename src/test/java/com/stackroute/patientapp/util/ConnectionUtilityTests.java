package com.stackroute.patientapp.util;

import com.mongodb.client.MongoCollection;
import com.stackroute.patientapp.model.Patient;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ConnectionUtilityTests {

    private MongoCollection<Patient> mongoCollection;

    @Test
    public void givenConnectionStringThenReturnMongoCollection() {
        mongoCollection = ConnectionUtility.getCollection();
        assertThat(mongoCollection,is(notNullValue()));
   }
}