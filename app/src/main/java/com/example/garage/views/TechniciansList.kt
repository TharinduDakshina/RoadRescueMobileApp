package com.example.garage.views

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.garage.viewModels.GarageTechnician

@Composable
fun TechniciansList(){

    Column (
        modifier = defaultBackground,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){

        var techDetails=GarageTechnician("Thiran","Sasanka","Available","+94761339805", listOf("Engine Repair","BreakSystem repair","Oil & filter change"))

        Header(menuClicked = {})

        Spacer(modifier = Modifier.height(16.dp))

        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center){

                CommonButton(
                    btnName = "Add Technician",
                    modifier = Modifier.align(Alignment.CenterVertically),
                    onClickButton = {}
                )

        }

        Spacer(modifier = Modifier.height(16.dp))
        
        Card(
            modifier = cardDefaultModifier
                .align(Alignment.CenterHorizontally),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFB6C7E3)),
            border = BorderStroke(width = 2.dp, Color.White), 
        ) {

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.09f)
                    .background(Color(0xFFD9D9D9)),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){

                Box (
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .weight(1f),
                    contentAlignment = Alignment.Center){

                    Text(text = "Name", style = textStyle1, modifier = Modifier)

                }


                Box (
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .weight(0.8f),
                    contentAlignment = Alignment.Center){

                    Text(text = "Status", style = textStyle1, modifier = Modifier)

                }

                Box (
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .weight(1.3f),
                    contentAlignment = Alignment.Center){

                    Text(text = "", style = textStyle1, modifier = Modifier)

                }
            }

            // Load technicians

            TechniciansLoadStretcher(techDetails)



        }

        Spacer(modifier = Modifier.height(26.dp))

        Footer()
    }
}

@Composable
fun TechniciansLoadStretcher(technician: GarageTechnician){
    Row (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Box (
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .weight(1f)
                .padding(8.dp, 0.dp),
            contentAlignment = Alignment.Center){

            Text(text = technician.getTechFirstName()+" "+technician.getTechLastName(), textAlign = TextAlign.Center, fontSize = 17.sp, color = Color.Black, modifier = Modifier, maxLines = 2)

        }

        Box (
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterVertically)
                .weight(0.8f),
            contentAlignment = Alignment.Center
        ){

            Text(text = technician.getTechStatus(),textAlign = TextAlign.Center, fontSize = 17.sp, color = Color.Black, modifier = Modifier, maxLines = 2)

        }

        Box (
            modifier = Modifier
                .fillMaxWidth()
                .weight(1.3f),
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
            ){

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Outlined.Delete,
                        contentDescription =null,
                        modifier = Modifier
                            .background(Color.White, shape = CircleShape)
                            .weight(1f)
                            .size(25.dp),
                        tint = Color.Black
                    )
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Outlined.Edit,
                        contentDescription =null,
                        modifier = Modifier
                            .background(Color.White, shape = CircleShape)
                            .weight(1f)
                            .size(25.dp),
                        tint = Color.Black
                    )
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Outlined.Info,
                        contentDescription = null,
                        modifier = Modifier
                            .background(Color.White, shape = CircleShape)
                            .weight(1f)
                            .size(25.dp),
                        tint = Color.Black
                    )
                }
            }



        }
    }
}