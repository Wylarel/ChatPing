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

## MIT License
```
Copyright (c) 2020 Wylarel

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
