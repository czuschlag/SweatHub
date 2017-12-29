/**
 * 
 */
package main.java;
import java.time;

/**
 * @author Christopher
 *
 */
public class User {
	
	int userID;
	String loginID;
	String password;
	String firstName;
	String lastName;
	float userWeight;
	
	Statistic[] getUserStatisticList()
	{
		
		
	}
	
	int getUserStatisticValue(String statisticName)
	{
		
		
	}
	
	int getUserStatisticValue(String statisticName, OffsetDateTime asOf)
	{
		
		
	}
	
	Location[] getLocationList()
	{
		
		
	}
	
	Workout[] getMyWorkouts()
	{
		
		
	}
	
	void SetWorkout(int baseWorkout)
	{
		
		
		
	}
	
	Exercise[] getMyExercises()
	{
		
		
	}

	Schedule getMySchedule()
	{
		
		
	}

	void setWeight()
	{
		
		
	}
	
	void removeUser()
	{
		
		
	}
	
	boolean isValidPassword()
	{
	
		
	}
	
	void createNewUserStatisic(String statisticName)
	{
		
		
	}
	
	void setUserStatisicValue(String statisticName, OffsetDateTime asOf)
	{
		
		
	}
	
	
	WorkoutLocation[] getWorkoutLocations()
	{
		
		
	}
	
	void createWorkoutLocation(String locationName)
	{
		WorkoutLocation addedLocation;
		
		if
		{
			addedLocation = new WorkoutLocation(locationName);
			addedLocation.userid = userID;
		}
		else
			throw DuplicateValueException;
	}
}
