plotxy<- function(dataset, type, mode, runtime){
  x <- c()
  y <- c()
  index <- 1 
  
  #decrease i user/item/density(point)
  if (type==1){
    if (mode == "linear"){
      for (i in 1:runtime){
        temp <-formation(dataset,type,i*5)
        x[index] <- i*5
        y[index] <- linearmod(temp)
        index <- index + 1 
      } 
    }else if(mode=="mf"){
      for (i in 1:runtime){
        temp <-formation(dataset,type,i*5)
        temp<-temp[,c(1:3)]
        x[index] <- i*5
        y[index] <- mf(temp)
        index <- index + 1 
      } 
    }
    plot(x,y,main = "change in number of users",xlab = "# of users decrease", ylab = "absoulte error in prediction")
    abline(lm(y~x))
  }else if (type==2){
    if (mode == "linear"){
      for (i in 1:runtime){
        temp <-formation(dataset,type,i*10)
        x[index] <- i*10
        y[index] <- linearmod(temp)
        index <- index + 1 
      } 
    }else if(mode=="mf"){
      for (i in 1:runtime){
        temp <- formation(dataset,type,i*10)
        temp <- temp[,c(1:3)]
        x[index] <- i*10
        y[index] <- mf(temp)
        index <- index + 1 
      } 
    }
    plot(x,y,main = "change in number of items",xlab = "# of items decrease", ylab = "absoulte error in prediction")
    abline(lm(y~x))
  }else if (type==3){
    if (mode == "linear"){
      for (i in 1:runtime){
        temp <- formation(dataset,type,i*100)
        x[index] <- i*100
        y[index] <- linearmod(temp)
        index <- index + 1 
      } 
    }else if(mode=="mf"){
      for (i in 1:runtime){
        temp <- formation(dataset,type,i*100)
        temp <- temp[,c(1:3)]
        x[index] <- i*100
        y[index] <- mf(temp)
        index <- index + 1 
      } 
    }
    plot(x,y,main = "change in density",xlab = "# of ratings decrease", ylab = "absoulte error in prediction")
    abline(lm(y~x))
  }
}