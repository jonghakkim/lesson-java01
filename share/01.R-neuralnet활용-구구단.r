install.packages('neuralnet')
library("neuralnet")

#Going to create a neural network to perform sqare rooting
#Type ?neuralnet for more information on the neuralnet library

#Generate 50 random numbers uniformly distributed between 0 and 100
#And store them as a dataframe
traininginput1 <- c(3, 3, 3, 3, 3, 3, 3)
traininginput2 <- c(1, 3, 6, 7, 11, 15, 20)
trainingoutput <- c(3, 9, 18, 21, 33, 45, 60)

#Column bind the data into one variable
trainingdata <- cbind(traininginput1,traininginput2, trainingoutput)
colnames(trainingdata) <- c("Input1","input2", "Output")

print(trainingdata)


#Train the neural network
#Going to have 10 hidden layers
#Threshold is a numeric value specifying the threshold for the partial
#derivatives of the error function as stopping criteria.

net.sqrt <- neuralnet(Output~Input1+input2,trainingdata, hidden=0, threshold=0.01)
print(net.sqrt)

#Plot the neural network
plot(net.sqrt)

#Test the neural network on some training data
testdata <- cbind(3, 20) #Generate some squared numbers
net.results <- compute(net.sqrt, testdata) #Run them through the neural network

#Lets see what properties net.sqrt has
ls(net.results)

#Lets see the results
print(net.results$net.result)

#Lets display a better version of the results
cleanoutput <- cbind(testdata,sqrt(testdata),
                     as.data.frame(net.results$net.result))
colnames(cleanoutput) <- c("Input","Expected Output","Neural Net Output")
print(cleanoutput)

