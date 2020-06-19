# ChatPing
[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)](https://raw.githubusercontent.com/Wylarel/ChatPing/master/LICENSE)
## A Minecraft plugin to ping players in chat

**Tested Versions:** 1.15.x

## Configuration
```yaml
canselfping: [boolean] - Does a player get the ping if he mentions himself in the chat?

sound:
  enable: [boolean] - Does the ping play a sound effect to the mentioned player?
  value: [string] - Minecraft sound effect played when pinged
  
color: 
  enable: [boolean] - Does the ping appears in a different color in the chat?
  value: [string] - Color code of the color (using the & character)

actionbar: 
  enable: [boolean] - Does the ping appears in the actionbar?
  message: [string] - Message in the actionbar when pinged
```
