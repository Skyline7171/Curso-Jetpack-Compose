package com.example.cursojetpackcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.cursojetpackcompose.ui.theme.CursoJetpackComposeTheme

@Composable
fun DeviceView(device: Device) {
    Column {
        Text(text = device.name)
        Text(text = device.data?.color ?: "-")
        Text(text = device.data?.capacity ?: "-")
    }
}

@Preview(showBackground = true)
@Composable
fun DevicePreview() {
    CursoJetpackComposeTheme {
        DeviceView(device = Device(1, "Samsung", Specs("Negro", "128GB")))
    }
}